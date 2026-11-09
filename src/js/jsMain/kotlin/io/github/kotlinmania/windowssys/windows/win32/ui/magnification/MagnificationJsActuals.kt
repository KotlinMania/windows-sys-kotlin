@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT

private val _windowsWin32UiMagnificationNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun MagGetColorEffect(hwnd: HWND, peffect: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagGetColorEffect(hwnd.toString(), peffect.toString()) as Int) else 0

public actual fun MagGetFullscreenColorEffect(peffect: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagGetFullscreenColorEffect(peffect.toString()) as Int) else 0

public actual fun MagGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagGetFullscreenTransform(pmaglevel.toString(), pxoffset.toString(), pyoffset.toString()) as Int) else 0

public actual fun MagGetImageScalingCallback(hwnd: HWND): MagImageScalingCallback =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagGetImageScalingCallback(hwnd.toString()) as String).toLong() else null

public actual fun MagGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagGetInputTransform(pfenabled.toString(), prectsource.toString(), prectdest.toString()) as Int) else 0

public actual fun MagGetWindowFilterList(hwnd: HWND, pdwfiltermode: Long, count: Int, phwnd: Long): Int =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagGetWindowFilterList(hwnd.toString(), pdwfiltermode.toString(), count, phwnd.toString()) as Int) else 0

public actual fun MagGetWindowSource(hwnd: HWND, prect: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagGetWindowSource(hwnd.toString(), prect.toString()) as Int) else 0

public actual fun MagGetWindowTransform(hwnd: HWND, ptransform: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagGetWindowTransform(hwnd.toString(), ptransform.toString()) as Int) else 0

public actual fun MagInitialize(): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagInitialize() as Int) else 0

public actual fun MagSetColorEffect(hwnd: HWND, peffect: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagSetColorEffect(hwnd.toString(), peffect.toString()) as Int) else 0

public actual fun MagSetFullscreenColorEffect(peffect: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagSetFullscreenColorEffect(peffect.toString()) as Int) else 0

public actual fun MagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagSetFullscreenTransform(maglevel.toDouble(), xoffset, yoffset) as Int) else 0

public actual fun MagSetImageScalingCallback(hwnd: HWND, callback: MagImageScalingCallback): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagSetImageScalingCallback(hwnd.toString(), callback.toLong().toString()) as Int) else 0

public actual fun MagSetInputTransform(fenabled: BOOL, prectsource: Long, prectdest: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagSetInputTransform(fenabled, prectsource.toString(), prectdest.toString()) as Int) else 0

public actual fun MagSetWindowFilterList(hwnd: HWND, dwfiltermode: MW_FILTERMODE, count: Int, phwnd: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagSetWindowFilterList(hwnd.toString(), dwfiltermode.toInt(), count, phwnd.toString()) as Int) else 0

public actual fun MagSetWindowSource(hwnd: HWND, rect: RECT): BOOL =
    0

public actual fun MagSetWindowTransform(hwnd: HWND, ptransform: Long): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagSetWindowTransform(hwnd.toString(), ptransform.toString()) as Int) else 0

public actual fun MagShowSystemCursor(fshowcursor: BOOL): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagShowSystemCursor(fshowcursor) as Int) else 0

public actual fun MagUninitialize(): BOOL =
    if (_windowsWin32UiMagnificationNapiAddon != null) (_windowsWin32UiMagnificationNapiAddon.windowssys_windows_win32_ui_magnification_MagUninitialize() as Int) else 0
