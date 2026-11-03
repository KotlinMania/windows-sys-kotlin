package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

public data class WPD_COMMAND_ACCESS_LOOKUP_ENTRY(
    public var Command: Foundation.PROPERTYKEY = Foundation.PROPERTYKEY(),
    public var AccessType: UInt = 0u,
    public var AccessProperty: Foundation.PROPERTYKEY = Foundation.PROPERTYKEY(),
)
