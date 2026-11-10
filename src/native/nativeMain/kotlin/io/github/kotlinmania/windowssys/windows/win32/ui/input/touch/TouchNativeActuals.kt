@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_closeGestureInfoHandle(hgestureinfo?.value?.toCPointer<ByteVar>())

public actual fun closeTouchInputHandle(htouchinput: Htouchinput): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_closeTouchInputHandle(htouchinput?.value?.toCPointer<ByteVar>())

public actual fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: COpaquePointer?, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_getGestureConfig(hwnd?.value?.toCPointer<ByteVar>(), dwreserved, dwflags, pcids?.value?.toCPointer<ByteVar>(), pgestureconfig?.value?.toCPointer<ByteVar>(), cbsize)

public actual fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_getGestureExtraArgs(hgestureinfo?.value?.toCPointer<ByteVar>(), cbextraargs, pextraargs?.value?.toCPointer<ByteVar>())

public actual fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_getGestureInfo(hgestureinfo?.value?.toCPointer<ByteVar>(), pgestureinfo?.value?.toCPointer<ByteVar>())

public actual fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_getTouchInputInfo(htouchinput?.value?.toCPointer<ByteVar>(), cinputs, pinputs?.value?.toCPointer<ByteVar>(), cbsize)

public actual fun isTouchWindow(hwnd: Hwnd, pulflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_isTouchWindow(hwnd?.value?.toCPointer<ByteVar>(), pulflags?.value?.toCPointer<ByteVar>())

public actual fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_registerTouchWindow(hwnd?.value?.toCPointer<ByteVar>(), ulflags)

public actual fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_setGestureConfig(hwnd?.value?.toCPointer<ByteVar>(), dwreserved, cids, pgestureconfig?.value?.toCPointer<ByteVar>(), cbsize)

public actual fun unregisterTouchWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.input.touch.cinterop.windowssys_windows_win32_ui_input_touch_unregisterTouchWindow(hwnd?.value?.toCPointer<ByteVar>())
