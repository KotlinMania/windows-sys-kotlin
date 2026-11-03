package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.core.BOOL

public data class BSMINFO(
    public var cbSize: UInt = 0u,
    public var hdesk: HDESK = 0L,
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var luid: Foundation.LUID = Foundation.LUID(),
)

public data class USEROBJECTFLAGS(
    public var fInherit: BOOL = 0,
    public var fReserved: BOOL = 0,
    public var dwFlags: UInt = 0u,
)
