package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn

public typealias MwFiltermode = UInt

public fun interface MagImageScalingCallbackFn {
    public operator fun invoke(hwnd: Hwnd, srcdata: COpaquePointer?, srcheader: Magimageheader, destdata: COpaquePointer?, destheader: Magimageheader, unclipped: Rect, clipped: Rect, dirty: Hrgn): Bool
}

public typealias MagImageScalingCallback = MagImageScalingCallbackFn?
