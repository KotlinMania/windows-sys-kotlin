package io.github.kotlinmania.windowssys.windows.win32.devices.properties

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.DEVPROPKEY

public data class DEVPROPCOMPKEY(
    public var Key: DEVPROPKEY = DEVPROPKEY(),
    public var Store: DEVPROPSTORE = 0,
    public var LocaleName: PCWSTR = 0L,
)

public data class DEVPROPERTY(
    public var CompKey: DEVPROPCOMPKEY = DEVPROPCOMPKEY(),
    public var Type: DEVPROPTYPE = 0u,
    public var BufferSize: UInt = 0u,
    public var Buffer: Long = 0L,
)
