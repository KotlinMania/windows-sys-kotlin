@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32UiInputTouchJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_CloseGestureInfoHandle(hgestureinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_CloseTouchInputHandle(htouchinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_GetGestureConfig(hwnd: Long, dwreserved: Int, dwflags: Int, pcids: Long, pgestureconfig: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_GetGestureExtraArgs(hgestureinfo: Long, cbextraargs: Int, pextraargs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_GetGestureInfo(hgestureinfo: Long, pgestureinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_GetTouchInputInfo(htouchinput: Long, cinputs: Int, pinputs: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_IsTouchWindow(hwnd: Long, pulflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_RegisterTouchWindow(hwnd: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_SetGestureConfig(hwnd: Long, dwreserved: Int, cids: Int, pgestureconfig: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_input_touch_UnregisterTouchWindow(hwnd: Long): Int
}

public actual fun CloseGestureInfoHandle(hgestureinfo: HGESTUREINFO): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_CloseGestureInfoHandle(hgestureinfo)

public actual fun CloseTouchInputHandle(htouchinput: HTOUCHINPUT): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_CloseTouchInputHandle(htouchinput)

public actual fun GetGestureConfig(hwnd: HWND, dwreserved: UInt, dwflags: UInt, pcids: Long, pgestureconfig: Long, cbsize: UInt): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_GetGestureConfig(hwnd, dwreserved.toInt(), dwflags.toInt(), pcids, pgestureconfig, cbsize.toInt())

public actual fun GetGestureExtraArgs(hgestureinfo: HGESTUREINFO, cbextraargs: UInt, pextraargs: Long): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_GetGestureExtraArgs(hgestureinfo, cbextraargs.toInt(), pextraargs)

public actual fun GetGestureInfo(hgestureinfo: HGESTUREINFO, pgestureinfo: Long): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_GetGestureInfo(hgestureinfo, pgestureinfo)

public actual fun GetTouchInputInfo(htouchinput: HTOUCHINPUT, cinputs: UInt, pinputs: Long, cbsize: Int): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_GetTouchInputInfo(htouchinput, cinputs.toInt(), pinputs, cbsize)

public actual fun IsTouchWindow(hwnd: HWND, pulflags: Long): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_IsTouchWindow(hwnd, pulflags)

public actual fun RegisterTouchWindow(hwnd: HWND, ulflags: REGISTER_TOUCH_WINDOW_FLAGS): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_RegisterTouchWindow(hwnd, ulflags.toInt())

public actual fun SetGestureConfig(hwnd: HWND, dwreserved: UInt, cids: UInt, pgestureconfig: Long, cbsize: UInt): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_SetGestureConfig(hwnd, dwreserved.toInt(), cids.toInt(), pgestureconfig, cbsize.toInt())

public actual fun UnregisterTouchWindow(hwnd: HWND): BOOL =
    WindowsWin32UiInputTouchJniBridge.windowssys_windows_win32_ui_input_touch_UnregisterTouchWindow(hwnd)
