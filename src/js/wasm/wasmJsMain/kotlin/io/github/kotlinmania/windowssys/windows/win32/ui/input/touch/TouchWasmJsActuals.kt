@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun CloseGestureInfoHandle(hgestureinfo: HGESTUREINFO): BOOL =
    0

public actual fun CloseTouchInputHandle(htouchinput: HTOUCHINPUT): BOOL =
    0

public actual fun GetGestureConfig(hwnd: HWND, dwreserved: UInt, dwflags: UInt, pcids: Long, pgestureconfig: Long, cbsize: UInt): BOOL =
    0

public actual fun GetGestureExtraArgs(hgestureinfo: HGESTUREINFO, cbextraargs: UInt, pextraargs: Long): BOOL =
    0

public actual fun GetGestureInfo(hgestureinfo: HGESTUREINFO, pgestureinfo: Long): BOOL =
    0

public actual fun GetTouchInputInfo(htouchinput: HTOUCHINPUT, cinputs: UInt, pinputs: Long, cbsize: Int): BOOL =
    0

public actual fun IsTouchWindow(hwnd: HWND, pulflags: Long): BOOL =
    0

public actual fun RegisterTouchWindow(hwnd: HWND, ulflags: REGISTER_TOUCH_WINDOW_FLAGS): BOOL =
    0

public actual fun SetGestureConfig(hwnd: HWND, dwreserved: UInt, cids: UInt, pgestureconfig: Long, cbsize: UInt): BOOL =
    0

public actual fun UnregisterTouchWindow(hwnd: HWND): BOOL =
    0
