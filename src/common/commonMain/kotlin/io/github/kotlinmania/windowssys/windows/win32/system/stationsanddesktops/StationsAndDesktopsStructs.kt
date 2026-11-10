package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid

public data class Bsminfo(
    public var cbSize: UInt = 0u,
    public var hdesk: Hdesk = null,
    public var hwnd: Hwnd = null,
    public var luid: Luid = Luid(),
)

public data class Userobjectflags(
    public var fInherit: Bool = 0,
    public var fReserved: Bool = 0,
    public var dwFlags: UInt = 0u,
)
