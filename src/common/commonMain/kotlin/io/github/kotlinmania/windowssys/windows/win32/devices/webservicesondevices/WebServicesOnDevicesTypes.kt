package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.core.HRESULT

public typealias DeviceDiscoveryMechanism = Int

public fun interface PWSD_SOAP_MESSAGE_HANDLERFn {
    public operator fun invoke(thisunknown: Long, event: Long): HRESULT
}

public typealias PWSD_SOAP_MESSAGE_HANDLER = PWSD_SOAP_MESSAGE_HANDLERFn?

public typealias WSDEventType = Int

public typealias WSDUdpMessageType = Int

public typealias WSDXML_OP = Int

public typealias WSD_CONFIG_PARAM_TYPE = Int

public typealias WSD_PROTOCOL_TYPE = Int

public fun interface WSD_STUB_FUNCTIONFn {
    public operator fun invoke(server: Long, session: Long, event: Long): HRESULT
}

public typealias WSD_STUB_FUNCTION = WSD_STUB_FUNCTIONFn?
