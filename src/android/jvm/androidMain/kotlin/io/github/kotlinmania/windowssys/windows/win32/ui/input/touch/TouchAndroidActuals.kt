@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32UiInputTouchJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_closeGestureInfoHandle(hgestureinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_closeTouchInputHandle(htouchinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_getGestureConfig(hwnd: Long, dwreserved: Int, dwflags: Int, pcids: Long, pgestureconfig: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_getGestureExtraArgs(hgestureinfo: Long, cbextraargs: Int, pextraargs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_getGestureInfo(hgestureinfo: Long, pgestureinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_getTouchInputInfo(htouchinput: Long, cinputs: Int, pinputs: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_isTouchWindow(hwnd: Long, pulflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_registerTouchWindow(hwnd: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_setGestureConfig(hwnd: Long, dwreserved: Int, cids: Int, pgestureconfig: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_unregisterTouchWindow(hwnd: Long): Int
}

public actual fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_closeGestureInfoHandle((hgestureinfo?.value ?: 0L))

public actual fun closeTouchInputHandle(htouchinput: Htouchinput): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_closeTouchInputHandle((htouchinput?.value ?: 0L))

public actual fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: COpaquePointer?, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_getGestureConfig((hwnd?.value ?: 0L), dwreserved.toInt(), dwflags.toInt(), (pcids?.value ?: 0L), (pgestureconfig?.value ?: 0L), cbsize.toInt())

public actual fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: COpaquePointer?): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_getGestureExtraArgs((hgestureinfo?.value ?: 0L), cbextraargs.toInt(), (pextraargs?.value ?: 0L))

public actual fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: COpaquePointer?): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_getGestureInfo((hgestureinfo?.value ?: 0L), (pgestureinfo?.value ?: 0L))

public actual fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_getTouchInputInfo((htouchinput?.value ?: 0L), cinputs.toInt(), (pinputs?.value ?: 0L), cbsize)

public actual fun isTouchWindow(hwnd: Hwnd, pulflags: COpaquePointer?): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_isTouchWindow((hwnd?.value ?: 0L), (pulflags?.value ?: 0L))

public actual fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_registerTouchWindow((hwnd?.value ?: 0L), ulflags.toInt())

public actual fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_setGestureConfig((hwnd?.value ?: 0L), dwreserved.toInt(), cids.toInt(), (pgestureconfig?.value ?: 0L), cbsize.toInt())

public actual fun unregisterTouchWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_unregisterTouchWindow((hwnd?.value ?: 0L))
