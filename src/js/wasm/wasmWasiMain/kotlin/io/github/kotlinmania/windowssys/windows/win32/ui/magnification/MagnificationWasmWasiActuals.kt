@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT

public actual fun MagGetColorEffect(hwnd: HWND, peffect: Long): BOOL =
    0

public actual fun MagGetFullscreenColorEffect(peffect: Long): BOOL =
    0

public actual fun MagGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): BOOL =
    0

public actual fun MagGetImageScalingCallback(hwnd: HWND): MagImageScalingCallback =
    null

public actual fun MagGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): BOOL =
    0

public actual fun MagGetWindowFilterList(hwnd: HWND, pdwfiltermode: Long, count: Int, phwnd: Long): Int =
    0

public actual fun MagGetWindowSource(hwnd: HWND, prect: Long): BOOL =
    0

public actual fun MagGetWindowTransform(hwnd: HWND, ptransform: Long): BOOL =
    0

public actual fun MagInitialize(): BOOL =
    0

public actual fun MagSetColorEffect(hwnd: HWND, peffect: Long): BOOL =
    0

public actual fun MagSetFullscreenColorEffect(peffect: Long): BOOL =
    0

public actual fun MagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): BOOL =
    0

public actual fun MagSetImageScalingCallback(hwnd: HWND, callback: MagImageScalingCallback): BOOL =
    0

public actual fun MagSetInputTransform(fenabled: BOOL, prectsource: Long, prectdest: Long): BOOL =
    0

public actual fun MagSetWindowFilterList(hwnd: HWND, dwfiltermode: MW_FILTERMODE, count: Int, phwnd: Long): BOOL =
    0

public actual fun MagSetWindowSource(hwnd: HWND, rect: RECT): BOOL =
    0

public actual fun MagSetWindowTransform(hwnd: HWND, ptransform: Long): BOOL =
    0

public actual fun MagShowSystemCursor(fshowcursor: BOOL): BOOL =
    0

public actual fun MagUninitialize(): BOOL =
    0
