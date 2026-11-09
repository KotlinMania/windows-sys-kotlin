@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CloseGestureInfoHandle(hgestureinfo: HGESTUREINFO): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_CloseGestureInfoHandle(hgestureinfo.toCPointer<ByteVar>())

public actual fun CloseTouchInputHandle(htouchinput: HTOUCHINPUT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_CloseTouchInputHandle(htouchinput.toCPointer<ByteVar>())

public actual fun GetGestureConfig(hwnd: HWND, dwreserved: UInt, dwflags: UInt, pcids: Long, pgestureconfig: Long, cbsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_GetGestureConfig(hwnd.toCPointer<ByteVar>(), dwreserved, dwflags, pcids.toCPointer<ByteVar>(), pgestureconfig.toCPointer<ByteVar>(), cbsize)

public actual fun GetGestureExtraArgs(hgestureinfo: HGESTUREINFO, cbextraargs: UInt, pextraargs: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_GetGestureExtraArgs(hgestureinfo.toCPointer<ByteVar>(), cbextraargs, pextraargs.toCPointer<ByteVar>())

public actual fun GetGestureInfo(hgestureinfo: HGESTUREINFO, pgestureinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_GetGestureInfo(hgestureinfo.toCPointer<ByteVar>(), pgestureinfo.toCPointer<ByteVar>())

public actual fun GetTouchInputInfo(htouchinput: HTOUCHINPUT, cinputs: UInt, pinputs: Long, cbsize: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_GetTouchInputInfo(htouchinput.toCPointer<ByteVar>(), cinputs, pinputs.toCPointer<ByteVar>(), cbsize)

public actual fun IsTouchWindow(hwnd: HWND, pulflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_IsTouchWindow(hwnd.toCPointer<ByteVar>(), pulflags.toCPointer<ByteVar>())

public actual fun RegisterTouchWindow(hwnd: HWND, ulflags: REGISTER_TOUCH_WINDOW_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_RegisterTouchWindow(hwnd.toCPointer<ByteVar>(), ulflags)

public actual fun SetGestureConfig(hwnd: HWND, dwreserved: UInt, cids: UInt, pgestureconfig: Long, cbsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_SetGestureConfig(hwnd.toCPointer<ByteVar>(), dwreserved, cids, pgestureconfig.toCPointer<ByteVar>(), cbsize)

public actual fun UnregisterTouchWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_UnregisterTouchWindow(hwnd.toCPointer<ByteVar>())
