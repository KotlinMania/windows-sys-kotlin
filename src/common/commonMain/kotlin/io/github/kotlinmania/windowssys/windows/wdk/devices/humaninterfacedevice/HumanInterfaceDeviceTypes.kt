package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public fun interface EvtVhfAsyncOperationFn {
    public operator fun invoke(vhfclientcontext: ConstPtr, vhfoperationhandle: ConstPtr, vhfoperationcontext: ConstPtr, hidtransferpacket: ConstPtr)
}

public typealias EvtVhfAsyncOperation = EvtVhfAsyncOperationFn?

public fun interface EvtVhfCleanupFn {
    public operator fun invoke(vhfclientcontext: ConstPtr)
}

public typealias EvtVhfCleanup = EvtVhfCleanupFn?

public fun interface EvtVhfReadyForNextReadReportFn {
    public operator fun invoke(vhfclientcontext: ConstPtr)
}

public typealias EvtVhfReadyForNextReadReport = EvtVhfReadyForNextReadReportFn?
