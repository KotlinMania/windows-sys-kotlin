package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.windows.win32.foundation.PROPERTYKEY

public data class WPD_COMMAND_ACCESS_LOOKUP_ENTRY(
    public var Command: PROPERTYKEY = PROPERTYKEY(),
    public var AccessType: UInt = 0u,
    public var AccessProperty: PROPERTYKEY = PROPERTYKEY(),
)
