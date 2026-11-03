package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.core.BOOL

public typealias MW_FILTERMODE = UInt

public fun interface MagImageScalingCallbackFn {
    public operator fun invoke(hwnd: Foundation.HWND, srcdata: Long, srcheader: MAGIMAGEHEADER, destdata: Long, destheader: MAGIMAGEHEADER, unclipped: Foundation.RECT, clipped: Foundation.RECT, dirty: Graphics.Gdi.HRGN): BOOL
}

public typealias MagImageScalingCallback = MagImageScalingCallbackFn?
