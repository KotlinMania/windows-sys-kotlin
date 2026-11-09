@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT

private object WindowsWin32UiMagnificationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagGetColorEffect(hwnd: Long, peffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagGetFullscreenColorEffect(peffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagGetImageScalingCallback(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagGetWindowFilterList(hwnd: Long, pdwfiltermode: Long, count: Int, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagGetWindowSource(hwnd: Long, prect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagGetWindowTransform(hwnd: Long, ptransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagInitialize(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagSetColorEffect(hwnd: Long, peffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagSetFullscreenColorEffect(peffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagSetImageScalingCallback(hwnd: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagSetInputTransform(fenabled: Int, prectsource: Long, prectdest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagSetWindowFilterList(hwnd: Long, dwfiltermode: Int, count: Int, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagSetWindowTransform(hwnd: Long, ptransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagShowSystemCursor(fshowcursor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_MagUninitialize(): Int
}

public actual fun MagGetColorEffect(hwnd: HWND, peffect: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagGetColorEffect(hwnd, peffect)

public actual fun MagGetFullscreenColorEffect(peffect: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagGetFullscreenColorEffect(peffect)

public actual fun MagGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagGetFullscreenTransform(pmaglevel, pxoffset, pyoffset)

public actual fun MagGetImageScalingCallback(hwnd: HWND): MagImageScalingCallback =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagGetImageScalingCallback(hwnd)

public actual fun MagGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagGetInputTransform(pfenabled, prectsource, prectdest)

public actual fun MagGetWindowFilterList(hwnd: HWND, pdwfiltermode: Long, count: Int, phwnd: Long): Int =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagGetWindowFilterList(hwnd, pdwfiltermode, count, phwnd)

public actual fun MagGetWindowSource(hwnd: HWND, prect: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagGetWindowSource(hwnd, prect)

public actual fun MagGetWindowTransform(hwnd: HWND, ptransform: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagGetWindowTransform(hwnd, ptransform)

public actual fun MagInitialize(): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagInitialize()

public actual fun MagSetColorEffect(hwnd: HWND, peffect: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagSetColorEffect(hwnd, peffect)

public actual fun MagSetFullscreenColorEffect(peffect: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagSetFullscreenColorEffect(peffect)

public actual fun MagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagSetFullscreenTransform(maglevel, xoffset, yoffset)

public actual fun MagSetImageScalingCallback(hwnd: HWND, callback: MagImageScalingCallback): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagSetImageScalingCallback(hwnd, callback.toLong())

public actual fun MagSetInputTransform(fenabled: BOOL, prectsource: Long, prectdest: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagSetInputTransform(fenabled, prectsource, prectdest)

public actual fun MagSetWindowFilterList(hwnd: HWND, dwfiltermode: MW_FILTERMODE, count: Int, phwnd: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagSetWindowFilterList(hwnd, dwfiltermode.toInt(), count, phwnd)

public actual fun MagSetWindowSource(hwnd: HWND, rect: RECT): BOOL =
    0

public actual fun MagSetWindowTransform(hwnd: HWND, ptransform: Long): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagSetWindowTransform(hwnd, ptransform)

public actual fun MagShowSystemCursor(fshowcursor: BOOL): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagShowSystemCursor(fshowcursor)

public actual fun MagUninitialize(): BOOL =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_MagUninitialize()
