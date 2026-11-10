package io.github.kotlinmania.windowssys.windows.win32.devices.properties

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public data class Devpropcompkey(
    public var key: Devpropkey = Devpropkey(),
    public var store: Devpropstore = 0,
    public var localeName: Pcwstr = null,
)

public data class Devproperty(
    public var compKey: Devpropcompkey = Devpropcompkey(),
    public var type: Devproptype = 0u,
    public var bufferSize: UInt = 0u,
    public var buffer: COpaquePointer? = null,
)
