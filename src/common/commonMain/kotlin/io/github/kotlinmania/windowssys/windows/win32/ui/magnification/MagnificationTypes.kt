package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HRGN

public typealias MW_FILTERMODE = UInt

public fun interface MagImageScalingCallbackFn {
    public operator fun invoke(hwnd: HWND, srcdata: Long, srcheader: MAGIMAGEHEADER, destdata: Long, destheader: MAGIMAGEHEADER, unclipped: RECT, clipped: RECT, dirty: HRGN): BOOL
}

public typealias MagImageScalingCallback = MagImageScalingCallbackFn?
