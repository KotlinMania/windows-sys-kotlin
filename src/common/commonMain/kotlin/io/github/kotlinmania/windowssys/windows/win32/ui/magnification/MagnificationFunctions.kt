package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HRGN

public fun interface FnCallback {
    public operator fun invoke(hwnd: HWND, srcdata: Long, srcheader: MAGIMAGEHEADER, destdata: Long, destheader: MAGIMAGEHEADER, unclipped: RECT, clipped: RECT, dirty: HRGN): BOOL
}

public fun MagGetColorEffect(hwnd: HWND, peffect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetColorEffect", longArrayOf(hwnd, peffect)).toInt()
}

public fun MagGetFullscreenColorEffect(peffect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetFullscreenColorEffect", longArrayOf(peffect)).toInt()
}

public fun MagGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetFullscreenTransform", longArrayOf(pmaglevel, pxoffset, pyoffset)).toInt()
}

public fun MagGetImageScalingCallback(hwnd: HWND): MagImageScalingCallback {
    val rawRet = Win32DynamicFfi.invoke("magnification.dll", "MagGetImageScalingCallback", longArrayOf(hwnd))
    return if (rawRet == 0L) null else MagImageScalingCallbackFn { p0, p1, p2, p3, p4, p5, p6, p7 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0, p1, run { val buf = ByteArray(40); buf[0] = (p2.width.toInt() and 0xFF).toByte(); buf[1] = ((p2.width.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((p2.width.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((p2.width.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (p2.height.toInt() and 0xFF).toByte(); buf[5] = ((p2.height.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((p2.height.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((p2.height.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (p2.format.data1.toInt() and 0xFF).toByte(); buf[9] = ((p2.format.data1.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((p2.format.data1.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((p2.format.data1.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (p2.format.data2.toInt() and 0xFF).toByte(); buf[13] = ((p2.format.data2.toInt() ushr 8) and 0xFF).toByte(); buf[14] = (p2.format.data3.toInt() and 0xFF).toByte(); buf[15] = ((p2.format.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, p2.format.data4.size)) buf[16 + i] = p2.format.data4[i].toByte(); buf[24] = (p2.stride.toInt() and 0xFF).toByte(); buf[25] = ((p2.stride.toInt() ushr 8) and 0xFF).toByte(); buf[26] = ((p2.stride.toInt() ushr 16) and 0xFF).toByte(); buf[27] = ((p2.stride.toInt() ushr 24) and 0xFF).toByte(); buf[28] = (p2.offset.toInt() and 0xFF).toByte(); buf[29] = ((p2.offset.toInt() ushr 8) and 0xFF).toByte(); buf[30] = ((p2.offset.toInt() ushr 16) and 0xFF).toByte(); buf[31] = ((p2.offset.toInt() ushr 24) and 0xFF).toByte(); buf[32] = (p2.cbSize.toLong() and 0xFF).toByte(); buf[33] = ((p2.cbSize.toLong() ushr 8) and 0xFF).toByte(); buf[34] = ((p2.cbSize.toLong() ushr 16) and 0xFF).toByte(); buf[35] = ((p2.cbSize.toLong() ushr 24) and 0xFF).toByte(); buf[36] = ((p2.cbSize.toLong() ushr 32) and 0xFF).toByte(); buf[37] = ((p2.cbSize.toLong() ushr 40) and 0xFF).toByte(); buf[38] = ((p2.cbSize.toLong() ushr 48) and 0xFF).toByte(); buf[39] = ((p2.cbSize.toLong() ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(40); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, p3, run { val buf = ByteArray(40); buf[0] = (p4.width.toInt() and 0xFF).toByte(); buf[1] = ((p4.width.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((p4.width.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((p4.width.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (p4.height.toInt() and 0xFF).toByte(); buf[5] = ((p4.height.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((p4.height.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((p4.height.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (p4.format.data1.toInt() and 0xFF).toByte(); buf[9] = ((p4.format.data1.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((p4.format.data1.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((p4.format.data1.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (p4.format.data2.toInt() and 0xFF).toByte(); buf[13] = ((p4.format.data2.toInt() ushr 8) and 0xFF).toByte(); buf[14] = (p4.format.data3.toInt() and 0xFF).toByte(); buf[15] = ((p4.format.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, p4.format.data4.size)) buf[16 + i] = p4.format.data4[i].toByte(); buf[24] = (p4.stride.toInt() and 0xFF).toByte(); buf[25] = ((p4.stride.toInt() ushr 8) and 0xFF).toByte(); buf[26] = ((p4.stride.toInt() ushr 16) and 0xFF).toByte(); buf[27] = ((p4.stride.toInt() ushr 24) and 0xFF).toByte(); buf[28] = (p4.offset.toInt() and 0xFF).toByte(); buf[29] = ((p4.offset.toInt() ushr 8) and 0xFF).toByte(); buf[30] = ((p4.offset.toInt() ushr 16) and 0xFF).toByte(); buf[31] = ((p4.offset.toInt() ushr 24) and 0xFF).toByte(); buf[32] = (p4.cbSize.toLong() and 0xFF).toByte(); buf[33] = ((p4.cbSize.toLong() ushr 8) and 0xFF).toByte(); buf[34] = ((p4.cbSize.toLong() ushr 16) and 0xFF).toByte(); buf[35] = ((p4.cbSize.toLong() ushr 24) and 0xFF).toByte(); buf[36] = ((p4.cbSize.toLong() ushr 32) and 0xFF).toByte(); buf[37] = ((p4.cbSize.toLong() ushr 40) and 0xFF).toByte(); buf[38] = ((p4.cbSize.toLong() ushr 48) and 0xFF).toByte(); buf[39] = ((p4.cbSize.toLong() ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(40); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, run { val buf = ByteArray(16); buf[0] = (p5.left and 0xFF).toByte(); buf[1] = ((p5.left ushr 8) and 0xFF).toByte(); buf[2] = ((p5.left ushr 16) and 0xFF).toByte(); buf[3] = ((p5.left ushr 24) and 0xFF).toByte(); buf[4] = (p5.top and 0xFF).toByte(); buf[5] = ((p5.top ushr 8) and 0xFF).toByte(); buf[6] = ((p5.top ushr 16) and 0xFF).toByte(); buf[7] = ((p5.top ushr 24) and 0xFF).toByte(); buf[8] = (p5.right and 0xFF).toByte(); buf[9] = ((p5.right ushr 8) and 0xFF).toByte(); buf[10] = ((p5.right ushr 16) and 0xFF).toByte(); buf[11] = ((p5.right ushr 24) and 0xFF).toByte(); buf[12] = (p5.bottom and 0xFF).toByte(); buf[13] = ((p5.bottom ushr 8) and 0xFF).toByte(); buf[14] = ((p5.bottom ushr 16) and 0xFF).toByte(); buf[15] = ((p5.bottom ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, run { val buf = ByteArray(16); buf[0] = (p6.left and 0xFF).toByte(); buf[1] = ((p6.left ushr 8) and 0xFF).toByte(); buf[2] = ((p6.left ushr 16) and 0xFF).toByte(); buf[3] = ((p6.left ushr 24) and 0xFF).toByte(); buf[4] = (p6.top and 0xFF).toByte(); buf[5] = ((p6.top ushr 8) and 0xFF).toByte(); buf[6] = ((p6.top ushr 16) and 0xFF).toByte(); buf[7] = ((p6.top ushr 24) and 0xFF).toByte(); buf[8] = (p6.right and 0xFF).toByte(); buf[9] = ((p6.right ushr 8) and 0xFF).toByte(); buf[10] = ((p6.right ushr 16) and 0xFF).toByte(); buf[11] = ((p6.right ushr 24) and 0xFF).toByte(); buf[12] = (p6.bottom and 0xFF).toByte(); buf[13] = ((p6.bottom ushr 8) and 0xFF).toByte(); buf[14] = ((p6.bottom ushr 16) and 0xFF).toByte(); buf[15] = ((p6.bottom ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, p7)).toInt() }
}

public fun MagGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetInputTransform", longArrayOf(pfenabled, prectsource, prectdest)).toInt()
}

public fun MagGetWindowFilterList(hwnd: HWND, pdwfiltermode: Long, count: Int, phwnd: Long): Int {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetWindowFilterList", longArrayOf(hwnd, pdwfiltermode, count.toLong(), phwnd)).toInt()
}

public fun MagGetWindowSource(hwnd: HWND, prect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetWindowSource", longArrayOf(hwnd, prect)).toInt()
}

public fun MagGetWindowTransform(hwnd: HWND, ptransform: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagGetWindowTransform", longArrayOf(hwnd, ptransform)).toInt()
}

public fun MagInitialize(): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagInitialize", longArrayOf()).toInt()
}

public fun MagSetColorEffect(hwnd: HWND, peffect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetColorEffect", longArrayOf(hwnd, peffect)).toInt()
}

public fun MagSetFullscreenColorEffect(peffect: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetFullscreenColorEffect", longArrayOf(peffect)).toInt()
}

public fun MagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): BOOL {
    return Win32DynamicFfi.invokeFp("magnification.dll", "MagSetFullscreenTransform", 1, false, longArrayOf((maglevel.toRawBits().toLong() and 0xFFFF_FFFFL), xoffset.toLong(), yoffset.toLong())).toLong().toInt()
}

public fun MagSetImageScalingCallback(hwnd: HWND, callback: MagImageScalingCallback): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetImageScalingCallback", longArrayOf(hwnd, Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun MagSetInputTransform(fenabled: BOOL, prectsource: Long, prectdest: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetInputTransform", longArrayOf(fenabled.toLong(), prectsource, prectdest)).toInt()
}

public fun MagSetWindowFilterList(hwnd: HWND, dwfiltermode: MW_FILTERMODE, count: Int, phwnd: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetWindowFilterList", longArrayOf(hwnd, dwfiltermode.toLong(), count.toLong(), phwnd)).toInt()
}

public fun MagSetWindowSource(hwnd: HWND, rect: RECT): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetWindowSource", longArrayOf(hwnd, run { val buf = ByteArray(16); buf[0] = (rect.left and 0xFF).toByte(); buf[1] = ((rect.left ushr 8) and 0xFF).toByte(); buf[2] = ((rect.left ushr 16) and 0xFF).toByte(); buf[3] = ((rect.left ushr 24) and 0xFF).toByte(); buf[4] = (rect.top and 0xFF).toByte(); buf[5] = ((rect.top ushr 8) and 0xFF).toByte(); buf[6] = ((rect.top ushr 16) and 0xFF).toByte(); buf[7] = ((rect.top ushr 24) and 0xFF).toByte(); buf[8] = (rect.right and 0xFF).toByte(); buf[9] = ((rect.right ushr 8) and 0xFF).toByte(); buf[10] = ((rect.right ushr 16) and 0xFF).toByte(); buf[11] = ((rect.right ushr 24) and 0xFF).toByte(); buf[12] = (rect.bottom and 0xFF).toByte(); buf[13] = ((rect.bottom ushr 8) and 0xFF).toByte(); buf[14] = ((rect.bottom ushr 16) and 0xFF).toByte(); buf[15] = ((rect.bottom ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr })).toInt()
}

public fun MagSetWindowTransform(hwnd: HWND, ptransform: Long): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagSetWindowTransform", longArrayOf(hwnd, ptransform)).toInt()
}

public fun MagShowSystemCursor(fshowcursor: BOOL): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagShowSystemCursor", longArrayOf(fshowcursor.toLong())).toInt()
}

public fun MagUninitialize(): BOOL {
    return Win32DynamicFfi.invoke("magnification.dll", "MagUninitialize", longArrayOf()).toInt()
}
