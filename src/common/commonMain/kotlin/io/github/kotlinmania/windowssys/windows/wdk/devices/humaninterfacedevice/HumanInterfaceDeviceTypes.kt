package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer

public fun interface EvtVhfAsyncOperationFn {
    public operator fun invoke(vhfclientcontext: COpaquePointer?, vhfoperationhandle: COpaquePointer?, vhfoperationcontext: COpaquePointer?, hidtransferpacket: COpaquePointer?)
}

public typealias EvtVhfAsyncOperation = EvtVhfAsyncOperationFn?

public fun interface EvtVhfCleanupFn {
    public operator fun invoke(vhfclientcontext: COpaquePointer?)
}

public typealias EvtVhfCleanup = EvtVhfCleanupFn?

public fun interface EvtVhfReadyForNextReadReportFn {
    public operator fun invoke(vhfclientcontext: COpaquePointer?)
}

public typealias EvtVhfReadyForNextReadReport = EvtVhfReadyForNextReadReportFn?
