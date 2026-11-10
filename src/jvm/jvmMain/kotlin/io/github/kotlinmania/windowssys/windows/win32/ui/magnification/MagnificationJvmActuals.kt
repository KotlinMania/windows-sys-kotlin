@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

private object WindowsWin32UiMagnificationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magGetColorEffect(hwnd: Long, peffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magGetFullscreenColorEffect(peffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magGetImageScalingCallback(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magGetWindowFilterList(hwnd: Long, pdwfiltermode: Long, count: Int, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magGetWindowSource(hwnd: Long, prect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magGetWindowTransform(hwnd: Long, ptransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magInitialize(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magSetColorEffect(hwnd: Long, peffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magSetFullscreenColorEffect(peffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magSetImageScalingCallback(hwnd: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magSetInputTransform(fenabled: Int, prectsource: Long, prectdest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magSetWindowFilterList(hwnd: Long, dwfiltermode: Int, count: Int, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magSetWindowTransform(hwnd: Long, ptransform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magShowSystemCursor(fshowcursor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_magnification_magUninitialize(): Int
}

public actual fun magGetColorEffect(hwnd: Hwnd, peffect: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magGetColorEffect((hwnd?.value ?: 0L), (peffect?.value ?: 0L))

public actual fun magGetFullscreenColorEffect(peffect: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magGetFullscreenColorEffect((peffect?.value ?: 0L))

public actual fun magGetFullscreenTransform(pmaglevel: COpaquePointer?, pxoffset: COpaquePointer?, pyoffset: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magGetFullscreenTransform((pmaglevel?.value ?: 0L), (pxoffset?.value ?: 0L), (pyoffset?.value ?: 0L))

public actual fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback =
    null

public actual fun magGetInputTransform(pfenabled: COpaquePointer?, prectsource: COpaquePointer?, prectdest: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magGetInputTransform((pfenabled?.value ?: 0L), (prectsource?.value ?: 0L), (prectdest?.value ?: 0L))

public actual fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: COpaquePointer?, count: Int, phwnd: COpaquePointer?): Int =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magGetWindowFilterList((hwnd?.value ?: 0L), (pdwfiltermode?.value ?: 0L), count, (phwnd?.value ?: 0L))

public actual fun magGetWindowSource(hwnd: Hwnd, prect: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magGetWindowSource((hwnd?.value ?: 0L), (prect?.value ?: 0L))

public actual fun magGetWindowTransform(hwnd: Hwnd, ptransform: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magGetWindowTransform((hwnd?.value ?: 0L), (ptransform?.value ?: 0L))

public actual fun magInitialize(): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magInitialize()

public actual fun magSetColorEffect(hwnd: Hwnd, peffect: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magSetColorEffect((hwnd?.value ?: 0L), (peffect?.value ?: 0L))

public actual fun magSetFullscreenColorEffect(peffect: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magSetFullscreenColorEffect((peffect?.value ?: 0L))

public actual fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magSetFullscreenTransform(maglevel, xoffset, yoffset)

public actual fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magSetImageScalingCallback((hwnd?.value ?: 0L), 0L)

public actual fun magSetInputTransform(fenabled: Bool, prectsource: COpaquePointer?, prectdest: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magSetInputTransform(fenabled, (prectsource?.value ?: 0L), (prectdest?.value ?: 0L))

public actual fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magSetWindowFilterList((hwnd?.value ?: 0L), dwfiltermode.toInt(), count, (phwnd?.value ?: 0L))

public actual fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool =
    0

public actual fun magSetWindowTransform(hwnd: Hwnd, ptransform: COpaquePointer?): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magSetWindowTransform((hwnd?.value ?: 0L), (ptransform?.value ?: 0L))

public actual fun magShowSystemCursor(fshowcursor: Bool): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magShowSystemCursor(fshowcursor)

public actual fun magUninitialize(): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssys_windows_win32_ui_magnification_magUninitialize()
