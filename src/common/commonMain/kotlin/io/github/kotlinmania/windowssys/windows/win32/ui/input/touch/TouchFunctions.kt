package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool

public expect fun closeTouchInputHandle(htouchinput: Htouchinput): Bool

public expect fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: COpaquePointer?, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool

public expect fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: COpaquePointer?): Bool

public expect fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: COpaquePointer?): Bool

public expect fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): Bool

public expect fun isTouchWindow(hwnd: Hwnd, pulflags: COpaquePointer?): Bool

public expect fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool

public expect fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: COpaquePointer?, cbsize: UInt): Bool

public expect fun unregisterTouchWindow(hwnd: Hwnd): Bool
