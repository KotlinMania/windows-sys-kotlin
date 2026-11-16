package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey

public data class WpdCommandAccessLookupEntry(
    public var command: Propertykey = Propertykey(),
    public var accessType: UInt = 0u,
    public var accessProperty: Propertykey = Propertykey(),
)
