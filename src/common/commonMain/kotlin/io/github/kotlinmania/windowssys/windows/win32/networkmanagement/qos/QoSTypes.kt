package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public fun interface CbadmitresultFn {
    public operator fun invoke(lpmhandle: LpmHandle, requesthandle: Rhandle, ulpcmactionflags: UInt, lpmerror: Int, policydecisionscount: Int, ppolicydecisions: COpaquePointer?): COpaquePointer?
}

public typealias Cbadmitresult = CbadmitresultFn?

public fun interface CbgetrsvpobjectsFn {
    public operator fun invoke(lpmhandle: LpmHandle, requesthandle: Rhandle, lpmerror: Int, rsvpobjectscount: Int, pprsvpobjects: COpaquePointer?): COpaquePointer?
}

public typealias Cbgetrsvpobjects = CbgetrsvpobjectsFn?

public typealias FilterType = Int

public typealias LpmHandle = COpaquePointer?

public fun interface PallocmemFn {
    public operator fun invoke(size: UInt): COpaquePointer?
}

public typealias Pallocmem = PallocmemFn?

public fun interface PfreememFn {
    public operator fun invoke(pv: COpaquePointer?)
}

public typealias Pfreemem = PfreememFn?

public typealias QosFlowrateReason = Int

public typealias QosNotifyFlow = Int

public typealias QosQueryFlow = Int

public typealias QosSetFlow = Int

public typealias QosShaping = Int

public typealias QosTrafficType = Int

public typealias Rhandle = COpaquePointer?

public fun interface TciAddFlowCompleteHandlerFn {
    public operator fun invoke(clflowctx: Handle, status: UInt)
}

public typealias TciAddFlowCompleteHandler = TciAddFlowCompleteHandlerFn?

public fun interface TciDelFlowCompleteHandlerFn {
    public operator fun invoke(clflowctx: Handle, status: UInt)
}

public typealias TciDelFlowCompleteHandler = TciDelFlowCompleteHandlerFn?

public fun interface TciModFlowCompleteHandlerFn {
    public operator fun invoke(clflowctx: Handle, status: UInt)
}

public typealias TciModFlowCompleteHandler = TciModFlowCompleteHandlerFn?

public fun interface TciNotifyHandlerFn {
    public operator fun invoke(clregctx: Handle, clifcctx: Handle, event: UInt, subcode: Handle, bufsize: UInt, buffer: COpaquePointer?)
}

public typealias TciNotifyHandler = TciNotifyHandlerFn?

public typealias IntServWkp = Int
