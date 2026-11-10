package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityDescriptor

public data class SwDeviceCreateInfo(
    public var cbSize: UInt = 0u,
    public var pszInstanceId: Pcwstr = null,
    public var pszzHardwareIds: Pcwstr = null,
    public var pszzCompatibleIds: Pcwstr = null,
    public var pContainerId: Guid? = null,
    public var capabilityFlags: UInt = 0u,
    public var pszDeviceDescription: Pcwstr = null,
    public var pszDeviceLocation: Pcwstr = null,
    public var pSecurityDescriptor: SecurityDescriptor? = null,
)
