package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public typealias CpuArchitecture = UInt

public typealias PfnWdsCliCallbackMessageId = UInt

public fun interface PfnWdsCliCallbackFn {
    public operator fun invoke(dwmessageid: PfnWdsCliCallbackMessageId, wparam: Wparam, lparam: Lparam, pvuserdata: COpaquePointer?)
}

public typealias PfnWdsCliCallback = PfnWdsCliCallbackFn?

public fun interface PfnWdsCliTraceFunctionFn {
    public operator fun invoke(pwszformat: Pcwstr, params: COpaquePointer?)
}

public typealias PfnWdsCliTraceFunction = PfnWdsCliTraceFunctionFn?

public fun interface PfnWdsTransportClientReceiveContentsFn {
    public operator fun invoke(hsessionkey: Handle, pcallerdata: COpaquePointer?, pcontents: COpaquePointer?, ulsize: UInt, pullcontentoffset: COpaquePointer?)
}

public typealias PfnWdsTransportClientReceiveContents = PfnWdsTransportClientReceiveContentsFn?

public fun interface PfnWdsTransportClientReceiveMetadataFn {
    public operator fun invoke(hsessionkey: Handle, pcallerdata: COpaquePointer?, pmetadata: COpaquePointer?, ulsize: UInt)
}

public typealias PfnWdsTransportClientReceiveMetadata = PfnWdsTransportClientReceiveMetadataFn?

public fun interface PfnWdsTransportClientSessionCompleteFn {
    public operator fun invoke(hsessionkey: Handle, pcallerdata: COpaquePointer?, dwerror: UInt)
}

public typealias PfnWdsTransportClientSessionComplete = PfnWdsTransportClientSessionCompleteFn?

public fun interface PfnWdsTransportClientSessionNegotiateFn {
    public operator fun invoke(hsessionkey: Handle, pcallerdata: COpaquePointer?, pinfo: COpaquePointer?, hnegotiatekey: Handle)
}

public typealias PfnWdsTransportClientSessionNegotiate = PfnWdsTransportClientSessionNegotiateFn?

public fun interface PfnWdsTransportClientSessionStartFn {
    public operator fun invoke(hsessionkey: Handle, pcallerdata: COpaquePointer?, ullfilesize: COpaquePointer?)
}

public typealias PfnWdsTransportClientSessionStart = PfnWdsTransportClientSessionStartFn?

public fun interface PfnWdsTransportClientSessionStartExFn {
    public operator fun invoke(hsessionkey: Handle, pcallerdata: COpaquePointer?, info: COpaquePointer?)
}

public typealias PfnWdsTransportClientSessionStartEx = PfnWdsTransportClientSessionStartExFn?

public typealias TransportclientCallbackId = Int

public typealias TransportproviderCallbackId = Int

public typealias WdstransportDiagnosticsComponentFlags = Int

public typealias WdstransportDisconnectType = Int

public typealias WdstransportFeatureFlags = Int

public typealias WdstransportIpAddressSourceType = Int

public typealias WdstransportIpAddressType = Int

public typealias WdstransportNamespaceType = Int

public typealias WdstransportNetworkProfileType = Int

public typealias WdstransportProtocolFlags = Int

public typealias WdstransportServiceNotification = Int

public typealias WdstransportSlowClientHandlingType = Int

public typealias WdstransportTftpCapability = Int

public typealias WdstransportUdpPortPolicy = Int

public typealias WdsCliFirmwareType = Int

public typealias WdsCliImageParamType = Int

public typealias WdsCliImageType = Int

public typealias WdsTransportclientRequestAuthLevel = UInt
