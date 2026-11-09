package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun CloseGestureInfoHandle(hgestureinfo: HGESTUREINFO): BOOL

public expect fun CloseTouchInputHandle(htouchinput: HTOUCHINPUT): BOOL

public expect fun GetGestureConfig(hwnd: HWND, dwreserved: UInt, dwflags: UInt, pcids: Long, pgestureconfig: Long, cbsize: UInt): BOOL

public expect fun GetGestureExtraArgs(hgestureinfo: HGESTUREINFO, cbextraargs: UInt, pextraargs: Long): BOOL

public expect fun GetGestureInfo(hgestureinfo: HGESTUREINFO, pgestureinfo: Long): BOOL

public expect fun GetTouchInputInfo(htouchinput: HTOUCHINPUT, cinputs: UInt, pinputs: Long, cbsize: Int): BOOL

public expect fun IsTouchWindow(hwnd: HWND, pulflags: Long): BOOL

public expect fun RegisterTouchWindow(hwnd: HWND, ulflags: REGISTER_TOUCH_WINDOW_FLAGS): BOOL

public expect fun SetGestureConfig(hwnd: HWND, dwreserved: UInt, cids: UInt, pgestureconfig: Long, cbsize: UInt): BOOL

public expect fun UnregisterTouchWindow(hwnd: HWND): BOOL
