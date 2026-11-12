package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public fun interface EvtVhfAsyncOperationFn {
    public operator fun invoke(vhfclientcontext: ConstPtr<CVoid>, vhfoperationhandle: ConstPtr<CVoid>, vhfoperationcontext: ConstPtr<CVoid>, hidtransferpacket: ConstPtr<HidXferPacket>)
}

public typealias EvtVhfAsyncOperation = EvtVhfAsyncOperationFn?

public fun interface EvtVhfCleanupFn {
    public operator fun invoke(vhfclientcontext: ConstPtr<CVoid>)
}

public typealias EvtVhfCleanup = EvtVhfCleanupFn?

public fun interface EvtVhfReadyForNextReadReportFn {
    public operator fun invoke(vhfclientcontext: ConstPtr<CVoid>)
}

public typealias EvtVhfReadyForNextReadReport = EvtVhfReadyForNextReadReportFn?
