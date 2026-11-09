package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT

public expect fun MagGetColorEffect(hwnd: HWND, peffect: Long): BOOL

public expect fun MagGetFullscreenColorEffect(peffect: Long): BOOL

public expect fun MagGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): BOOL

public expect fun MagGetImageScalingCallback(hwnd: HWND): MagImageScalingCallback

public expect fun MagGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): BOOL

public expect fun MagGetWindowFilterList(hwnd: HWND, pdwfiltermode: Long, count: Int, phwnd: Long): Int

public expect fun MagGetWindowSource(hwnd: HWND, prect: Long): BOOL

public expect fun MagGetWindowTransform(hwnd: HWND, ptransform: Long): BOOL

public expect fun MagInitialize(): BOOL

public expect fun MagSetColorEffect(hwnd: HWND, peffect: Long): BOOL

public expect fun MagSetFullscreenColorEffect(peffect: Long): BOOL

public expect fun MagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): BOOL

public expect fun MagSetImageScalingCallback(hwnd: HWND, callback: MagImageScalingCallback): BOOL

public expect fun MagSetInputTransform(fenabled: BOOL, prectsource: Long, prectdest: Long): BOOL

public expect fun MagSetWindowFilterList(hwnd: HWND, dwfiltermode: MW_FILTERMODE, count: Int, phwnd: Long): BOOL

public expect fun MagSetWindowSource(hwnd: HWND, rect: RECT): BOOL

public expect fun MagSetWindowTransform(hwnd: HWND, ptransform: Long): BOOL

public expect fun MagShowSystemCursor(fshowcursor: BOOL): BOOL

public expect fun MagUninitialize(): BOOL
