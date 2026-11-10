package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public expect fun magGetColorEffect(hwnd: Hwnd, peffect: COpaquePointer?): Bool

public expect fun magGetFullscreenColorEffect(peffect: COpaquePointer?): Bool

public expect fun magGetFullscreenTransform(pmaglevel: COpaquePointer?, pxoffset: COpaquePointer?, pyoffset: COpaquePointer?): Bool

public expect fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback

public expect fun magGetInputTransform(pfenabled: COpaquePointer?, prectsource: COpaquePointer?, prectdest: COpaquePointer?): Bool

public expect fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: COpaquePointer?, count: Int, phwnd: COpaquePointer?): Int

public expect fun magGetWindowSource(hwnd: Hwnd, prect: COpaquePointer?): Bool

public expect fun magGetWindowTransform(hwnd: Hwnd, ptransform: COpaquePointer?): Bool

public expect fun magInitialize(): Bool

public expect fun magSetColorEffect(hwnd: Hwnd, peffect: COpaquePointer?): Bool

public expect fun magSetFullscreenColorEffect(peffect: COpaquePointer?): Bool

public expect fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool

public expect fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool

public expect fun magSetInputTransform(fenabled: Bool, prectsource: COpaquePointer?, prectdest: COpaquePointer?): Bool

public expect fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: COpaquePointer?): Bool

public expect fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool

public expect fun magSetWindowTransform(hwnd: Hwnd, ptransform: COpaquePointer?): Bool

public expect fun magShowSystemCursor(fshowcursor: Bool): Bool

public expect fun magUninitialize(): Bool
