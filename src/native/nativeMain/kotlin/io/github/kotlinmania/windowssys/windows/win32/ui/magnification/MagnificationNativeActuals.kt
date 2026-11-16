@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagGetColorEffect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagGetFullscreenTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagGetInputTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagGetWindowFilterList
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagGetWindowSource
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagGetWindowTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagInitialize
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagSetColorEffect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagSetFullscreenTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagSetImageScalingCallback
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagSetInputTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagSetWindowFilterList
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagSetWindowTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagShowSystemCursor
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssysWindowsWin32UiMagnificationMagUninitialize
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun magGetColorEffect(hwnd: Hwnd, peffect: MutPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagGetColorEffect(hwnd.rawAddress.toCPointer<ByteVar>(), peffect.rawAddress.toCPointer<ByteVar>())

public actual fun magGetFullscreenColorEffect(peffect: MutPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect(peffect.rawAddress.toCPointer<ByteVar>())

public actual fun magGetFullscreenTransform(pmaglevel: MutPtr, pxoffset: MutPtr, pyoffset: MutPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagGetFullscreenTransform(pmaglevel.rawAddress.toCPointer<ByteVar>(), pxoffset.rawAddress.toCPointer<ByteVar>(), pyoffset.rawAddress.toCPointer<ByteVar>())

public actual fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback =
    null

public actual fun magGetInputTransform(pfenabled: MutPtr, prectsource: MutPtr, prectdest: MutPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagGetInputTransform(pfenabled.rawAddress.toCPointer<ByteVar>(), prectsource.rawAddress.toCPointer<ByteVar>(), prectdest.rawAddress.toCPointer<ByteVar>())

public actual fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: MutPtr, count: Int, phwnd: MutPtr): Int =
    windowssysWindowsWin32UiMagnificationMagGetWindowFilterList(hwnd.rawAddress.toCPointer<ByteVar>(), pdwfiltermode.rawAddress.toCPointer<ByteVar>(), count, phwnd.rawAddress.toCPointer<ByteVar>())

public actual fun magGetWindowSource(hwnd: Hwnd, prect: MutPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagGetWindowSource(hwnd.rawAddress.toCPointer<ByteVar>(), prect.rawAddress.toCPointer<ByteVar>())

public actual fun magGetWindowTransform(hwnd: Hwnd, ptransform: MutPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagGetWindowTransform(hwnd.rawAddress.toCPointer<ByteVar>(), ptransform.rawAddress.toCPointer<ByteVar>())

public actual fun magInitialize(): Bool =
    windowssysWindowsWin32UiMagnificationMagInitialize()

public actual fun magSetColorEffect(hwnd: Hwnd, peffect: MutPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagSetColorEffect(hwnd.rawAddress.toCPointer<ByteVar>(), peffect.rawAddress.toCPointer<ByteVar>())

public actual fun magSetFullscreenColorEffect(peffect: ConstPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect(peffect.rawAddress.toCPointer<ByteVar>())

public actual fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool =
    windowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(maglevel, xoffset, yoffset)

public actual fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool =
    windowssysWindowsWin32UiMagnificationMagSetImageScalingCallback(hwnd.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun magSetInputTransform(fenabled: Bool, prectsource: ConstPtr, prectdest: ConstPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagSetInputTransform(fenabled, prectsource.rawAddress.toCPointer<ByteVar>(), prectdest.rawAddress.toCPointer<ByteVar>())

public actual fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: MutPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagSetWindowFilterList(hwnd.rawAddress.toCPointer<ByteVar>(), dwfiltermode, count, phwnd.rawAddress.toCPointer<ByteVar>())

public actual fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool =
    0

public actual fun magSetWindowTransform(hwnd: Hwnd, ptransform: MutPtr): Bool =
    windowssysWindowsWin32UiMagnificationMagSetWindowTransform(hwnd.rawAddress.toCPointer<ByteVar>(), ptransform.rawAddress.toCPointer<ByteVar>())

public actual fun magShowSystemCursor(fshowcursor: Bool): Bool =
    windowssysWindowsWin32UiMagnificationMagShowSystemCursor(fshowcursor)

public actual fun magUninitialize(): Bool =
    windowssysWindowsWin32UiMagnificationMagUninitialize()
