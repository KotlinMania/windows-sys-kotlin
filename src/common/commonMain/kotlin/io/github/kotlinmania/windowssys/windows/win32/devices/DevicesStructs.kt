package io.github.kotlinmania.windowssys.windows.win32.devices

public data class IEEE1394_API_REQUEST(
    public var RequestNumber: UInt = 0u,
    public var Flags: UInt = 0u,
    public var u: IEEE1394_API_REQUEST_0 = IEEE1394_API_REQUEST_0(),
)

public data class IEEE1394_API_REQUEST_0(public var AddVirtualDevice: IEEE1394_VDEV_PNP_REQUEST = IEEE1394_VDEV_PNP_REQUEST(), public var RemoveVirtualDevice: IEEE1394_VDEV_PNP_REQUEST = IEEE1394_VDEV_PNP_REQUEST())

public data class IEEE1394_VDEV_PNP_REQUEST(
    public var fulFlags: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var InstanceId: ULong = 0uL,
    public var DeviceId: UByte = 0u,
)
