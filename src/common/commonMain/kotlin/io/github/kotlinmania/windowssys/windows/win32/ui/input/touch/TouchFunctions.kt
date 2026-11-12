package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun closeGestureInfoHandle(hgestureinfo: Hgestureinfo): Bool

public expect fun closeTouchInputHandle(htouchinput: Htouchinput): Bool

public expect fun getGestureConfig(hwnd: Hwnd, dwreserved: UInt, dwflags: UInt, pcids: ConstPtr<UInt>, pgestureconfig: MutPtr<Gestureconfig>, cbsize: UInt): Bool

public expect fun getGestureExtraArgs(hgestureinfo: Hgestureinfo, cbextraargs: UInt, pextraargs: MutPtr<UByte>): Bool

public expect fun getGestureInfo(hgestureinfo: Hgestureinfo, pgestureinfo: MutPtr<Gestureinfo>): Bool

public expect fun getTouchInputInfo(htouchinput: Htouchinput, cinputs: UInt, pinputs: MutPtr<Touchinput>, cbsize: Int): Bool

public expect fun isTouchWindow(hwnd: Hwnd, pulflags: MutPtr<UInt>): Bool

public expect fun registerTouchWindow(hwnd: Hwnd, ulflags: RegisterTouchWindowFlags): Bool

public expect fun setGestureConfig(hwnd: Hwnd, dwreserved: UInt, cids: UInt, pgestureconfig: ConstPtr<Gestureconfig>, cbsize: UInt): Bool

public expect fun unregisterTouchWindow(hwnd: Hwnd): Bool
