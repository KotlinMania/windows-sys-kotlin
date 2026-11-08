package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID

public data class BSMINFO(
    public var cbSize: UInt = 0u,
    public var hdesk: HDESK = 0L,
    public var hwnd: HWND = 0L,
    public var luid: LUID = LUID(),
)

public data class USEROBJECTFLAGS(
    public var fInherit: BOOL = 0,
    public var fReserved: BOOL = 0,
    public var dwFlags: UInt = 0u,
)
