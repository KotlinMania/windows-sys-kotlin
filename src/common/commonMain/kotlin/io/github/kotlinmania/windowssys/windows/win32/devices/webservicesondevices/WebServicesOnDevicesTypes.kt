package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

public typealias DeviceDiscoveryMechanism = Int

public fun interface PwsdSoapMessageHandlerFn {
    public operator fun invoke(thisunknown: MutPtr<CVoid>, event: MutPtr<WsdEvent>): Hresult
}

public typealias PwsdSoapMessageHandler = PwsdSoapMessageHandlerFn?

public typealias WSDEventType = Int

public typealias WSDUdpMessageType = Int

public typealias WsdxmlOp = Int

public typealias WsdConfigParamType = Int

public typealias WsdProtocolType = Int

public fun interface WsdStubFunctionFn {
    public operator fun invoke(server: MutPtr<CVoid>, session: MutPtr<CVoid>, event: MutPtr<WsdEvent>): Hresult
}

public typealias WsdStubFunction = WsdStubFunctionFn?
