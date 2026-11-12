package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public expect fun magGetColorEffect(hwnd: Hwnd, peffect: MutPtr<Magcoloreffect>): Bool

public expect fun magGetFullscreenColorEffect(peffect: MutPtr<Magcoloreffect>): Bool

public expect fun magGetFullscreenTransform(pmaglevel: MutPtr<Float>, pxoffset: MutPtr<Int>, pyoffset: MutPtr<Int>): Bool

public expect fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback

public expect fun magGetInputTransform(pfenabled: MutPtr<Bool>, prectsource: MutPtr<Rect>, prectdest: MutPtr<Rect>): Bool

public expect fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: MutPtr<MwFiltermode>, count: Int, phwnd: MutPtr<Hwnd>): Int

public expect fun magGetWindowSource(hwnd: Hwnd, prect: MutPtr<Rect>): Bool

public expect fun magGetWindowTransform(hwnd: Hwnd, ptransform: MutPtr<Magtransform>): Bool

public expect fun magInitialize(): Bool

public expect fun magSetColorEffect(hwnd: Hwnd, peffect: MutPtr<Magcoloreffect>): Bool

public expect fun magSetFullscreenColorEffect(peffect: ConstPtr<Magcoloreffect>): Bool

public expect fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool

public expect fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool

public expect fun magSetInputTransform(fenabled: Bool, prectsource: ConstPtr<Rect>, prectdest: ConstPtr<Rect>): Bool

public expect fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: MutPtr<Hwnd>): Bool

public expect fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool

public expect fun magSetWindowTransform(hwnd: Hwnd, ptransform: MutPtr<Magtransform>): Bool

public expect fun magShowSystemCursor(fshowcursor: Bool): Bool

public expect fun magUninitialize(): Bool
