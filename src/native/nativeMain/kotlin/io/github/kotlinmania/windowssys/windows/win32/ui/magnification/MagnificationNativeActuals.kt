@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magGetColorEffect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magGetFullscreenColorEffect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magGetFullscreenTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magGetInputTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magGetWindowFilterList
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magGetWindowSource
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magGetWindowTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magInitialize
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magSetColorEffect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magSetFullscreenColorEffect
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magSetFullscreenTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magSetImageScalingCallback
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magSetInputTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magSetWindowFilterList
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magSetWindowTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magShowSystemCursor
import io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_magUninitialize
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun magGetColorEffect(hwnd: Hwnd, peffect: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magGetColorEffect(hwnd?.value?.toCPointer<ByteVar>(), peffect?.value?.toCPointer<ByteVar>())

public actual fun magGetFullscreenColorEffect(peffect: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magGetFullscreenColorEffect(peffect?.value?.toCPointer<ByteVar>())

public actual fun magGetFullscreenTransform(pmaglevel: COpaquePointer?, pxoffset: COpaquePointer?, pyoffset: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magGetFullscreenTransform(pmaglevel?.value?.toCPointer<ByteVar>(), pxoffset?.value?.toCPointer<ByteVar>(), pyoffset?.value?.toCPointer<ByteVar>())

public actual fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback =
    null

public actual fun magGetInputTransform(pfenabled: COpaquePointer?, prectsource: COpaquePointer?, prectdest: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magGetInputTransform(pfenabled?.value?.toCPointer<ByteVar>(), prectsource?.value?.toCPointer<ByteVar>(), prectdest?.value?.toCPointer<ByteVar>())

public actual fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: COpaquePointer?, count: Int, phwnd: COpaquePointer?): Int =
    windowssys_windows_win32_ui_magnification_magGetWindowFilterList(hwnd?.value?.toCPointer<ByteVar>(), pdwfiltermode?.value?.toCPointer<ByteVar>(), count, phwnd?.value?.toCPointer<ByteVar>())

public actual fun magGetWindowSource(hwnd: Hwnd, prect: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magGetWindowSource(hwnd?.value?.toCPointer<ByteVar>(), prect?.value?.toCPointer<ByteVar>())

public actual fun magGetWindowTransform(hwnd: Hwnd, ptransform: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magGetWindowTransform(hwnd?.value?.toCPointer<ByteVar>(), ptransform?.value?.toCPointer<ByteVar>())

public actual fun magInitialize(): Bool =
    windowssys_windows_win32_ui_magnification_magInitialize()

public actual fun magSetColorEffect(hwnd: Hwnd, peffect: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magSetColorEffect(hwnd?.value?.toCPointer<ByteVar>(), peffect?.value?.toCPointer<ByteVar>())

public actual fun magSetFullscreenColorEffect(peffect: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magSetFullscreenColorEffect(peffect?.value?.toCPointer<ByteVar>())

public actual fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool =
    windowssys_windows_win32_ui_magnification_magSetFullscreenTransform(maglevel, xoffset, yoffset)

public actual fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool =
    windowssys_windows_win32_ui_magnification_magSetImageScalingCallback(hwnd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun magSetInputTransform(fenabled: Bool, prectsource: COpaquePointer?, prectdest: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magSetInputTransform(fenabled, prectsource?.value?.toCPointer<ByteVar>(), prectdest?.value?.toCPointer<ByteVar>())

public actual fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magSetWindowFilterList(hwnd?.value?.toCPointer<ByteVar>(), dwfiltermode, count, phwnd?.value?.toCPointer<ByteVar>())

public actual fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool =
    0

public actual fun magSetWindowTransform(hwnd: Hwnd, ptransform: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_magnification_magSetWindowTransform(hwnd?.value?.toCPointer<ByteVar>(), ptransform?.value?.toCPointer<ByteVar>())

public actual fun magShowSystemCursor(fshowcursor: Bool): Bool =
    windowssys_windows_win32_ui_magnification_magShowSystemCursor(fshowcursor)

public actual fun magUninitialize(): Bool =
    windowssys_windows_win32_ui_magnification_magUninitialize()
