package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public typealias CPU_ARCHITECTURE = UInt

public typealias PFN_WDS_CLI_CALLBACK_MESSAGE_ID = UInt

public fun interface PFN_WdsCliCallbackFn {
    public operator fun invoke(dwmessageid: PFN_WDS_CLI_CALLBACK_MESSAGE_ID, wparam: WPARAM, lparam: LPARAM, pvuserdata: Long)
}

public typealias PFN_WdsCliCallback = PFN_WdsCliCallbackFn?

public fun interface PFN_WdsCliTraceFunctionFn {
    public operator fun invoke(pwszformat: PCWSTR, params: Long)
}

public typealias PFN_WdsCliTraceFunction = PFN_WdsCliTraceFunctionFn?

public fun interface PFN_WdsTransportClientReceiveContentsFn {
    public operator fun invoke(hsessionkey: HANDLE, pcallerdata: Long, pcontents: Long, ulsize: UInt, pullcontentoffset: Long)
}

public typealias PFN_WdsTransportClientReceiveContents = PFN_WdsTransportClientReceiveContentsFn?

public fun interface PFN_WdsTransportClientReceiveMetadataFn {
    public operator fun invoke(hsessionkey: HANDLE, pcallerdata: Long, pmetadata: Long, ulsize: UInt)
}

public typealias PFN_WdsTransportClientReceiveMetadata = PFN_WdsTransportClientReceiveMetadataFn?

public fun interface PFN_WdsTransportClientSessionCompleteFn {
    public operator fun invoke(hsessionkey: HANDLE, pcallerdata: Long, dwerror: UInt)
}

public typealias PFN_WdsTransportClientSessionComplete = PFN_WdsTransportClientSessionCompleteFn?

public fun interface PFN_WdsTransportClientSessionNegotiateFn {
    public operator fun invoke(hsessionkey: HANDLE, pcallerdata: Long, pinfo: Long, hnegotiatekey: HANDLE)
}

public typealias PFN_WdsTransportClientSessionNegotiate = PFN_WdsTransportClientSessionNegotiateFn?

public fun interface PFN_WdsTransportClientSessionStartFn {
    public operator fun invoke(hsessionkey: HANDLE, pcallerdata: Long, ullfilesize: Long)
}

public typealias PFN_WdsTransportClientSessionStart = PFN_WdsTransportClientSessionStartFn?

public fun interface PFN_WdsTransportClientSessionStartExFn {
    public operator fun invoke(hsessionkey: HANDLE, pcallerdata: Long, info: Long)
}

public typealias PFN_WdsTransportClientSessionStartEx = PFN_WdsTransportClientSessionStartExFn?

public typealias TRANSPORTCLIENT_CALLBACK_ID = Int

public typealias TRANSPORTPROVIDER_CALLBACK_ID = Int

public typealias WDSTRANSPORT_DIAGNOSTICS_COMPONENT_FLAGS = Int

public typealias WDSTRANSPORT_DISCONNECT_TYPE = Int

public typealias WDSTRANSPORT_FEATURE_FLAGS = Int

public typealias WDSTRANSPORT_IP_ADDRESS_SOURCE_TYPE = Int

public typealias WDSTRANSPORT_IP_ADDRESS_TYPE = Int

public typealias WDSTRANSPORT_NAMESPACE_TYPE = Int

public typealias WDSTRANSPORT_NETWORK_PROFILE_TYPE = Int

public typealias WDSTRANSPORT_PROTOCOL_FLAGS = Int

public typealias WDSTRANSPORT_SERVICE_NOTIFICATION = Int

public typealias WDSTRANSPORT_SLOW_CLIENT_HANDLING_TYPE = Int

public typealias WDSTRANSPORT_TFTP_CAPABILITY = Int

public typealias WDSTRANSPORT_UDP_PORT_POLICY = Int

public typealias WDS_CLI_FIRMWARE_TYPE = Int

public typealias WDS_CLI_IMAGE_PARAM_TYPE = Int

public typealias WDS_CLI_IMAGE_TYPE = Int

public typealias WDS_TRANSPORTCLIENT_REQUEST_AUTH_LEVEL = UInt
