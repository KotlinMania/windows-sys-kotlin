package io.github.kotlinmania.windowssys.windows.win32.devices

public data class Ieee1394ApiRequest(
    public var requestNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var u: Ieee1394ApiRequest0 = Ieee1394ApiRequest0(),
)

public data class Ieee1394ApiRequest0(public var addVirtualDevice: Ieee1394VdevPnpRequest = Ieee1394VdevPnpRequest(), public var removeVirtualDevice: Ieee1394VdevPnpRequest = Ieee1394VdevPnpRequest())

public data class Ieee1394VdevPnpRequest(
    public var fulFlags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var instanceId: ULong = 0uL,
    public var deviceId: UByte = 0u,
)
