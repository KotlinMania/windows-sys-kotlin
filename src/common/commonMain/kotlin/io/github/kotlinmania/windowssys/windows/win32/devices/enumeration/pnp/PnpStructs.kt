package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.core.PCWSTR

public data class SW_DEVICE_CREATE_INFO(
    public var cbSize: UInt = 0u,
    public var pszInstanceId: PCWSTR = 0L,
    public var pszzHardwareIds: PCWSTR = 0L,
    public var pszzCompatibleIds: PCWSTR = 0L,
    public var pContainerId: Long = 0L,
    public var CapabilityFlags: UInt = 0u,
    public var pszDeviceDescription: PCWSTR = 0L,
    public var pszDeviceLocation: PCWSTR = 0L,
    public var pSecurityDescriptor: Long = 0L,
)
