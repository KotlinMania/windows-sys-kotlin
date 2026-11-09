@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun MagGetColorEffect(hwnd: HWND, peffect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagGetColorEffect(hwnd.toCPointer<ByteVar>(), peffect.toCPointer<ByteVar>())

public actual fun MagGetFullscreenColorEffect(peffect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagGetFullscreenColorEffect(peffect.toCPointer<ByteVar>())

public actual fun MagGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagGetFullscreenTransform(pmaglevel.toCPointer<ByteVar>(), pxoffset.toCPointer<ByteVar>(), pyoffset.toCPointer<ByteVar>())

public actual fun MagGetImageScalingCallback(hwnd: HWND): MagImageScalingCallback =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagGetImageScalingCallback(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MagGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagGetInputTransform(pfenabled.toCPointer<ByteVar>(), prectsource.toCPointer<ByteVar>(), prectdest.toCPointer<ByteVar>())

public actual fun MagGetWindowFilterList(hwnd: HWND, pdwfiltermode: Long, count: Int, phwnd: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagGetWindowFilterList(hwnd.toCPointer<ByteVar>(), pdwfiltermode.toCPointer<ByteVar>(), count, phwnd.toCPointer<ByteVar>())

public actual fun MagGetWindowSource(hwnd: HWND, prect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagGetWindowSource(hwnd.toCPointer<ByteVar>(), prect.toCPointer<ByteVar>())

public actual fun MagGetWindowTransform(hwnd: HWND, ptransform: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagGetWindowTransform(hwnd.toCPointer<ByteVar>(), ptransform.toCPointer<ByteVar>())

public actual fun MagInitialize(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagInitialize()

public actual fun MagSetColorEffect(hwnd: HWND, peffect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagSetColorEffect(hwnd.toCPointer<ByteVar>(), peffect.toCPointer<ByteVar>())

public actual fun MagSetFullscreenColorEffect(peffect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagSetFullscreenColorEffect(peffect.toCPointer<ByteVar>())

public actual fun MagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagSetFullscreenTransform(maglevel, xoffset, yoffset)

public actual fun MagSetImageScalingCallback(hwnd: HWND, callback: MagImageScalingCallback): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagSetImageScalingCallback(hwnd.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>())

public actual fun MagSetInputTransform(fenabled: BOOL, prectsource: Long, prectdest: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagSetInputTransform(fenabled, prectsource.toCPointer<ByteVar>(), prectdest.toCPointer<ByteVar>())

public actual fun MagSetWindowFilterList(hwnd: HWND, dwfiltermode: MW_FILTERMODE, count: Int, phwnd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagSetWindowFilterList(hwnd.toCPointer<ByteVar>(), dwfiltermode, count, phwnd.toCPointer<ByteVar>())

public actual fun MagSetWindowSource(hwnd: HWND, rect: RECT): BOOL =
    0

public actual fun MagSetWindowTransform(hwnd: HWND, ptransform: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagSetWindowTransform(hwnd.toCPointer<ByteVar>(), ptransform.toCPointer<ByteVar>())

public actual fun MagShowSystemCursor(fshowcursor: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagShowSystemCursor(fshowcursor)

public actual fun MagUninitialize(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.magnification.cinterop.windowssys_windows_win32_ui_magnification_MagUninitialize()
