package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun interface FnCallback {
    public operator fun invoke(hwnd: Foundation.HWND, srcdata: Long, srcheader: MAGIMAGEHEADER, destdata: Long, destheader: MAGIMAGEHEADER, unclipped: Foundation.RECT, clipped: Foundation.RECT, dirty: Graphics.Gdi.HRGN): BOOL
}

public fun MagGetColorEffect(hwnd: Foundation.HWND, peffect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetColorEffect", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), peffect)).toInt()
}

public fun MagGetFullscreenColorEffect(peffect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetFullscreenColorEffect", longArrayOf(peffect)).toInt()
}

public fun MagGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetFullscreenTransform", longArrayOf(pmaglevel, pxoffset, pyoffset)).toInt()
}

public fun MagGetImageScalingCallback(hwnd: Foundation.HWND): MagImageScalingCallback {
    val rawRet = Win32DynamicFfi.invoke("magnification.dll", "MagGetImageScalingCallback", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
    return if (rawRet == 0L) null else MagImageScalingCallbackFn { _, _, _, _, _, _, _, _ -> 0 }
}

public fun MagGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetInputTransform", longArrayOf(pfenabled, prectsource, prectdest)).toInt()
}

public fun MagGetWindowFilterList(hwnd: Foundation.HWND, pdwfiltermode: Long, count: Int, phwnd: Long): Int {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetWindowFilterList", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pdwfiltermode, count.toLong(), phwnd)).toInt()
}

public fun MagGetWindowSource(hwnd: Foundation.HWND, prect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetWindowSource", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), prect)).toInt()
}

public fun MagGetWindowTransform(hwnd: Foundation.HWND, ptransform: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetWindowTransform", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ptransform)).toInt()
}

public fun MagInitialize(): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagInitialize", longArrayOf()).toInt()
}

public fun MagSetColorEffect(hwnd: Foundation.HWND, peffect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetColorEffect", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), peffect)).toInt()
}

public fun MagSetFullscreenColorEffect(peffect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetFullscreenColorEffect", longArrayOf(peffect)).toInt()
}

public fun MagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): BOOL {
    return Win32DynamicFfi.invokeFp("magnification.dll", "MagSetFullscreenTransform", 1, false, longArrayOf((maglevel.toRawBits().toLong() and 0xFFFF_FFFFL), xoffset.toLong(), yoffset.toLong())).toLong().toInt()
}

public fun MagSetImageScalingCallback(hwnd: Foundation.HWND, callback: MagImageScalingCallback): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetImageScalingCallback", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun MagSetInputTransform(fenabled: BOOL, prectsource: Long, prectdest: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetInputTransform", longArrayOf(fenabled.toLong(), prectsource, prectdest)).toInt()
}

public fun MagSetWindowFilterList(hwnd: Foundation.HWND, dwfiltermode: MW_FILTERMODE, count: Int, phwnd: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetWindowFilterList", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwfiltermode.toLong(), count.toLong(), phwnd)).toInt()
}

public fun MagSetWindowSource(hwnd: Foundation.HWND, rect: Foundation.RECT): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetWindowSource", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(rect))).toInt()
}

public fun MagSetWindowTransform(hwnd: Foundation.HWND, ptransform: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetWindowTransform", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ptransform)).toInt()
}

public fun MagShowSystemCursor(fshowcursor: BOOL): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagShowSystemCursor", longArrayOf(fshowcursor.toLong())).toInt()
}

public fun MagUninitialize(): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagUninitialize", longArrayOf()).toInt()
}
