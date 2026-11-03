package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

public fun interface EVT_VHF_ASYNC_OPERATIONFn {
    public operator fun invoke(vhfclientcontext: Long, vhfoperationhandle: Long, vhfoperationcontext: Long, hidtransferpacket: Long)
}

public typealias EVT_VHF_ASYNC_OPERATION = EVT_VHF_ASYNC_OPERATIONFn?

public fun interface EVT_VHF_CLEANUPFn {
    public operator fun invoke(vhfclientcontext: Long)
}

public typealias EVT_VHF_CLEANUP = EVT_VHF_CLEANUPFn?

public fun interface EVT_VHF_READY_FOR_NEXT_READ_REPORTFn {
    public operator fun invoke(vhfclientcontext: Long)
}

public typealias EVT_VHF_READY_FOR_NEXT_READ_REPORT = EVT_VHF_READY_FOR_NEXT_READ_REPORTFn?
